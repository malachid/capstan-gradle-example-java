# Capstan Java example project, using Gradle

This is an example [Capstan](https://github.com/cloudius-systems/capstan) project for building and running Java applications on [OSv](http://osv.io/).

NOTE: This is tweaked from [the official Maven example](https://github.com/cloudius-systems/capstan-example-java).

To try it out, first install Capstan:

``` sh
curl https://raw.githubusercontent.com/cloudius-systems/capstan/master/scripts/download | bash
```

If you're running on Linux, Capstan will use QEMU/KVM as the default
hypervisor and on OS X, it will use VirtualBox.

Next step, clone this repository:

``` sh
git clone git@github.com:malachid/capstan-gradle-example-java.git
```

two alternatives to run the application, with or without Capstanfile

* Using a Capstanfile

``` sh
capstan run 
```

* Using a Jar file directly using [Apache Maven](https://maven.apache.org/), without a Capstanfile

```
./gradlew withDeps
```

That's it!
