# osgi-versions-example
An example of osgi modules that depend on different version of a model library. There's only one version installed in runtime, since the service interface depends on 1.0.0 and service implementation uses 1.1.0. This resembles a normal java project managed by maven, only with OSGi smell.

# building

  mvn clean install

# running

Start karaf

  bin/start
  bin/client
  repo-add mvn:osgitest/parent/1.0.0/xml/features; feature:install osgitest

Now you can test the commands using the service:

  test:client1 John
  test:client2 Doe
  
This example also demonstrates property injection and dynamic service reloading, one can change the etc/osgitest.service.cfg and see how test:client2 output changes.
