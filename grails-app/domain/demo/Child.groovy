package demo

class Child {

    String dummy

    static belongsTo = [ parent : Parent ]

    static constraints = {
        parent nullable: false
    }
}