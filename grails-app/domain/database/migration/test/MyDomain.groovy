package database.migration.test

import grails.rest.*

@Resource(uri='/domains')
class MyDomain {

    String name

    Date dateCreated
    Date lastUpdated

    static constraints = {
        name blank: false
    }

}
