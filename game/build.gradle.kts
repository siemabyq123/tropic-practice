repositories {
    maven("https://repo.glaremasters.me/repository/concuncan/")
    maven("https://repo.dmulloy2.net/repository/public/")
}

dependencies {
    api(project(":shared"))
    api(project(":services:statistics"))
    api(project(":services:games:api"))
    api(project(":services:games:models"))
    api(project(":services:replications:api"))
    compileOnly("com.grinderwolf:slimeworldmanager-plugin:2.2.1")
    compileOnly("com.comphenix.protocol:ProtocolLib:4.7.0")
}
