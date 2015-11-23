# Grails Exception Loop

Demonstrates a bug introduced in Grails 3.0.5 where chaing the UrlMappings.groovy to add an error processor, and having an exception generated in an interceptor, results in an infinite loop.

This code works in Grails 3.0.4 and earlier.
