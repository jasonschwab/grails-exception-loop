class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        //"500"(view:'/error')
        "500"(controller: "error", action: "processError")
        "404"(view:'/notFound')
    }
}
