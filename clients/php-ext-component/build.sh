#!/bin/bash

EXT_VERSION=sapobroker-0.2

# create
mkdir -p build/$EXT_VERSION

# copy
cp package.xml build/
cp config.m4 build/$EXT_VERSION
cp *.c build/$EXT_VERSION
cp *.h build/$EXT_VERSION
cp -r tests build/$EXT_VERSION

# clean
find build/ | grep svn | xargs rm -rf

# build
cd build
tar -czf ../$EXT_VERSION.tgz package.xml $EXT_VERSION
cd ../

# clean
# rm -rf build

# build deb
mkdir tmp
mv $EXT_VERSION.tgz tmp/
cd tmp/

dh-make-pecl --maintainer "Filipe Varela <filipe.varela@caixamagica.pt>" --only 5 $EXT_VERSION.tgz
cd php-$EXT_VERSION/

# quick hack for FAIL dh_shlibdeps
cat debian/rules | grep -v shlibdeps > debian/rulesnew
mv debian/rulesnew debian/rules
chmod +x debian/rules
dpkg-buildpackage -rfakeroot
cd ../
mv *.deb ../
cd ../
rm -rf build tmp