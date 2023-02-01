stage('build') {

    parallel(
        a: {
            node('ubuntu') {
                // git branch: 'main', credentialsId: 'cf646dbe-d09f-4d80-99a0-ec9be5122ede', url: 'git@github.com:jeromepochat/sandbox-jenkins.git'
                // sh 'mvn --version'
                sh 'echo "Hello 1"'
            }
        },
        b: {
            node('ubuntu') {
                // git branch: 'main', credentialsId: 'cf646dbe-d09f-4d80-99a0-ec9be5122ede', url: 'git@github.com:jeromepochat/sandbox-jenkins.git'
                // sh 'mvn --version'
                sh 'echo "Hello 2"'
            }
        }
        // node {
        //     withDockerContainer( 
        //         image: 'maven:3.8.7-eclipse-temurin-11-alpine',
        //         args: '-v "$(pwd)":/usr/src/mymaven -w /usr/src/mymaven') {
        //         git branch: 'main', credentialsId: 'cf646dbe-d09f-4d80-99a0-ec9be5122ede', url: 'git@github.com:jeromepochat/sandbox-jenkins.git'
        //         sh 'mvn clean install -Dgroups=com.acme.sandbox.Fast'
        //     }
        // }
    )
}
