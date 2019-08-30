# Database Migration Test

This is to test the `database-migration` plugin with Grails 4.0.0 and MySQL.

## To Setup

### Create the Database

    $ \\mysql -u root -e "DROP DATABASE IF EXISTS databasemigrationtest;"
    $ \\mysql -u root -e "CREATE DATABASE databasemigrationtest CHARACTER SET utf8;"

### Create Or Update the Schema

    $ ./gradlew dbm-update

## To Run

    $ ./gradlew bootRun

And point your browser to http://localhost:8080/
