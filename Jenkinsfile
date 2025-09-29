pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'staging',
                    credentialsId: 'github-pat',  // use your real ID
                    url: 'https://github.com/sarah801/Hotel_NTI.git'
            }
        }
        stage('Build') {
            steps {
                sh 'echo "Build successful ✅"'
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo "Fake deploy completed 🚀"'
            }
        }
    }
}
