job('MyGeneratedJob') {
    description('This job is generated via Job DSL from GitHub')

    scm {
        git('https://github.com/apurva0495/JenkinsPracticeArti.git', 'master')
    }

    triggers {
        cron('H 12 * * 1-5') // Runs at 12 PM on weekdays
    }

    steps {
        batchFile('echo "Hello, Jenkins! Running Job from DSL script"')
    }
}
