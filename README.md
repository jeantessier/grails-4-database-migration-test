# Database Migration Test

This is to test the `database-migration` plugin with Grails 4.0.0 and MySQL.

## To Setup

### Create the Database

    $ mysql -u root -e "DROP DATABASE IF EXISTS databasemigrationtest;"
    $ mysql -u root -e "CREATE DATABASE databasemigrationtest CHARACTER SET utf8;"

### Create Or Update the Schema

    $ ./gradlew dbm-update

## To Run

    $ ./gradlew bootRun

And point your browser to http://localhost:8080/

### REST Calls

The following examples use [HTTPie](https://httpie.org/).

You can create a domain object with:

    $ http POST :8080/domains "name=Jean Tessier"

You can list existing domains objects with:

    $ http :8080/domains

You can delete an existing domain object with:

    $ http DELETE :8080/domains/1
