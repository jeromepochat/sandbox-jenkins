stage('build') {

    parallel(
        node('maven') {
            git branch: 'main', credentialsId: 'cf646dbe-d09f-4d80-99a0-ec9be5122ede', url: 'git@github.com:jeromepochat/sandbox-jenkins.git'
            sh 'mvn clean install -Dgroups=com.acme.sandbox.Fast'
        },
        node {
            withDockerContainer( 
                image: 'maven:3.8.7-eclipse-temurin-11-alpine',
                args: '-v "$(pwd)":/usr/src/mymaven -w /usr/src/mymaven') {
                git branch: 'main', credentialsId: 'cf646dbe-d09f-4d80-99a0-ec9be5122ede', url: 'git@github.com:jeromepochat/sandbox-jenkins.git'
                sh 'mvn clean install -Dgroups=com.acme.sandbox.Fast'
            }
        }
    )
}
