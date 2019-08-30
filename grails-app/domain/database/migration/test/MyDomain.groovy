package database.migration.test

class MyDomain {

    String name

    Date dateCreated
    Date lastUpdated

    static constraints = {
        name blank: false
    }

}
