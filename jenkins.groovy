pipeline{
    agent any
    stages{
        
        stage('build'){
            steps {
              sh 'gradlew build'
            }
        }
        stage('run'){
            steps {
                sh 'gradlew bootRun'
            }
        }
    }
}