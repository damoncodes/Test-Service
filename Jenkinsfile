pipeline{
stages{

    stage("Project Checkout"){
        steps{
            git 'https://github.com/damoncodes/Test-Service.git'
              }
     }

    stage("Build"){
        steps{
            sh 'mvn clean install'
             }
    }

    stage("Docker Image"){
        steps{
            script{
                sh 'docker image build -t $$JOB_NAME:v1.$BUILD_ID .'
            }

        }

    }
  }
}