// pipeline {
//     agent any
//     stages {
        stage('Node') {
            agent {
                docker {
                    image 'node:16-alpine'
                }
            }
            steps {
                sh 'node --version'
            }
        }
        stage('Shell') {
            agent {
                node {
                    label 'ubuntu'
                }
            }
            steps {
                sh 'hostname'
            }
        }
        // stage('ParallelBranches') {
        //     def branches = [:]
        //     branches["a"] = {
        //         echo "Hello from branch a"
        //     }
        //     branches["b"] = {
        //         echo "Hello from branch b"
        //     }
        //     parallel branches
        // }
//     }
// }