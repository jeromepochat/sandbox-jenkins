stage('Shell using Kubernetes') {
    node('ubuntu') {
        sh 'hostname'
    }
}
stage('Shell using Docker') {
    node {
        withDockerContainer('node:16-alpine') {
            sh 'node --version'
        }
    }
}

stage('Maven using Docker') {
    node {
        withDockerContainer('maven:3.8.7-eclipse-temurin-11-alpine') {
            sh 'mvn clean install'
        }
    }
}
