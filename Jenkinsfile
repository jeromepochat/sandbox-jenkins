NUMBER_OF_BRANCHES=2

def splits

// agent any

stage('Prepare splits') {
    node {
        checkout scm
        splits = splitTests estimateTestsFromFiles: true, generateInclusions: true, parallelism: count(NUMBER_OF_BRANCHES)
    }
}

stage('Integration') {
    node {
        def branches = [:]
        for (int i = 0; i < splits.size(); i++) {
            def num = i
            def split = splits[num]
            branches["split${num}"] = {
                echo "in split$num: $split"
                // writeFile file: (split.includes ? 'includes.txt' : 'excludes.txt'), text: split.list.join("\n")
                // writeFile file: (split.includes ? 'excludes.txt' : 'includes.txt'), text: ''
            }
        }
    }

//     parallel(
//         a: {
//             node('ubuntu') {
//                 // git branch: 'main', credentialsId: 'cf646dbe-d09f-4d80-99a0-ec9be5122ede', url: 'git@github.com:jeromepochat/sandbox-jenkins.git'
//                 // sh 'mvn --version'
//                 sh 'echo "Hello from container 1"'
//             }
//         },
//         b: {
//             node('ubuntu') {
//                 // git branch: 'main', credentialsId: 'cf646dbe-d09f-4d80-99a0-ec9be5122ede', url: 'git@github.com:jeromepochat/sandbox-jenkins.git'
//                 // sh 'mvn --version'
//                 sh 'echo "Hello from container 2"'
//             }
//         }
//     )
}
