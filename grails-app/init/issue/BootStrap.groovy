package issue

import demo.Child
import demo.Parent

class BootStrap {

    def init = { servletContext ->

        def map = [
                "child": ["dummy": "populated"]
        ]


        Parent parent = new Parent(map)

        // Workaround:
        // def child = new Child(map.child)
        // Parent parent  =  new Parent(child: child)
        // child.parent = parent

        boolean isValid = parent.validate()
        if ( parent.hasErrors() ) {
            println parent.errors
        }
        assert isValid
    }
    def destroy = {
    }
}
