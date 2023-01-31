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
