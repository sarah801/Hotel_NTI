pipeline {
    agent any

    environment {
        REGISTRY = "10.0.0.50:5000"
        IMAGE = "${REGISTRY}/odoo-app:latest"
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'staging', url: 'https://github.com/sarah801/Hotel_NTI.git'
            }
        }

        stage('Build') {
            steps {
                echo '🧱 Building Docker image...'
                sh '''
                docker build -t $IMAGE .
                '''
            }
        }

        stage('Push') {
            steps {
                echo '📦 Pushing Docker image to registry...'
                sh '''
                docker push $IMAGE
                '''
            }
        }

        stage('Deploy') {
            steps {
                echo '🚀 Deploying to Kubernetes...'
                sh '''
                kubectl apply -f odoo-deployment.yaml
                kubectl rollout status deployment/odoo-deployment
                '''
            }
        }
    }

    post {
        success {
            echo '✅ Pipeline completed successfully!'
        }
        failure {
            echo '❌ Pipeline failed. Check logs.'
        }
    }
}
