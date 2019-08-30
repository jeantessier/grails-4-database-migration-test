package v0001

databaseChangeLog = {

    changeSet(author: "Jean Tessier", id: "2019-08-29 20:22") {

        createTable(tableName: "my_domain") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints nullable: "false", primaryKey: "true"
            }

            column(name: "version", type: "BIGINT") {
                constraints nullable: "false"
            }

            column(name: "name", type: "VARCHAR(255)") {
                constraints nullable: "false"
            }

            column(name: "date_created", type: "DATETIME") {
                constraints nullable: "false"
            }

            column(name: "last_updated", type: "DATETIME") {
                constraints nullable: "false"
            }
        }

    }

}
