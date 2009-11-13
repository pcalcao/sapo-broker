package pt.com.broker.client.sample;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

import org.caudexorigo.cli.CliFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pt.com.broker.client.BrokerClient;
import pt.com.broker.client.CliArgs;
import pt.com.broker.types.NetNotification;

/**
 * Queue consumer sample using Poll method - synchronous consumer.
 * 
 */
public class QueueSyncConsumer
{
	private static final Logger log = LoggerFactory.getLogger(QueueSyncConsumer.class);
	private final AtomicInteger counter = new AtomicInteger(0);

	private String host;
	private int port;
	private String dname;

	public static void main(String[] args) throws Throwable
	{
		final CliArgs cargs = CliFactory.parseArguments(CliArgs.class, args);

		QueueSyncConsumer qsconsumer = new QueueSyncConsumer();

		qsconsumer.host = cargs.getHost();
		qsconsumer.port = cargs.getPort();
		qsconsumer.dname = cargs.getDestination();

		BrokerClient bk = new BrokerClient(qsconsumer.host, qsconsumer.port, "tcp://mycompany.com/mysniffer");

		qsconsumer.receiveLoop(bk);
	}

	volatile int count = 0;

	private void receiveLoop(BrokerClient bk) throws Throwable
	{
		while (true)
		{
			NetNotification notification = bk.poll(dname);
			
			System.out.printf("===========================     [%s]#%s   =================================%n", new Date(), counter.incrementAndGet());
			System.out.printf("Destination: '%s'%n", notification.getDestination());
			System.out.printf("Subscription: '%s'%n", notification.getSubscription());
			System.out.printf("Payload: '%s'%n", new String(notification.getMessage().getPayload()));
			
			bk.acknowledge(notification);
		}
	}
}