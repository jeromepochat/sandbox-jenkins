stage('Shell using Kubernetes') {
    node('maven') {
        git branch: 'main', credentialsId: 'cf646dbe-d09f-4d80-99a0-ec9be5122ede', url: 'git@github.com:jeromepochat/sandbox-jenkins.git'
        sh 'mvn clean install -Dgroups=com.acme.sandbox.Fast'
    }
}

stage('Maven using Docker') {
    node {
        withDockerContainer('maven:3.8.7-eclipse-temurin-11-alpine') {
            git branch: 'main', credentialsId: 'cf646dbe-d09f-4d80-99a0-ec9be5122ede', url: 'git@github.com:jeromepochat/sandbox-jenkins.git'
            sh 'mvn clean install -Dgroups=com.acme.sandbox.Fast'
        }
    }
}
