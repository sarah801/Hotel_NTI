pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'staging',
                    credentialsId: 'github-pat',  
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
pipeline {
  agent any

  environment {
    REGISTRY = "your-registry-ip:5000"
    IMAGE = "odoo-app"
    KUBECONFIG_CREDENTIALS_ID = "kubeconfig-cred"
  }

  stages {
    stage('Checkout') {
      steps {
        git branch: 'main', url: 'https://github.com/yourusername/your-repo.git'
      }
    }

    stage('Build Docker Image') {
      steps {
        script {
          sh 'docker build -t ${REGISTRY}/${IMAGE}:latest .'
        }
      }
    }

    stage('Push Image to Registry') {
      steps {
        script {
          sh 'docker push ${REGISTRY}/${IMAGE}:latest'
        }
      }
    }

    stage('Deploy to Kubernetes') {
      steps {
        withCredentials([file(credentialsId: env.KUBECONFIG_CREDENTIALS_ID, variable: 'KUBECONFIG')]) {
          sh '''
            kubectl --kubeconfig=$KUBECONFIG set image deployment/odoo-deployment odoo-container=${REGISTRY}/${IMAGE}:latest
            kubectl --kubeconfig=$KUBECONFIG rollout restart deployment/odoo-deployment
          '''
        }
      }
    }
  }
}
