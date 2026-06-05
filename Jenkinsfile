pipeline {

agent any

tools {
    jdk 'JDK21'
    maven 'Maven3'
}

stages {

    stage('Git Checkout') {
        steps {
            git 'https://github.com/Khushburautu01/tutorialsninjaAutomation.git'
        }
    }

    stage('Build') {
        steps {
            bat 'mvn clean compile'
        }
    }

    stage('Run Tests') {
        steps {
            bat 'mvn test'
        }
    }

    stage('Generate Report') {
        steps {
            publishHTML([
                allowMissing: false,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'target',
                reportFiles: 'cucumber-report.html',
                reportName: 'Cucumber Report'
            ])
        }
    }
}

}
