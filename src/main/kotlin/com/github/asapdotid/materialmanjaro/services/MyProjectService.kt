package com.github.asapdotid.materialmanjaro.services

import com.intellij.openapi.project.Project
import com.github.asapdotid.materialmanjaro.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
