pipeline{
  agent any
  stages{
    
    environment{
      VERSION=1.2.3
    }
            stage("dev_build"){
              steps{
                echo "Dev V${1.2.3} - Building project"
              }
            }

            stage("dev_integrate"){
              steps{
                echo "Dev V${1.2.3} - Integrating... ${1.2.3}"
              }
            }

            stage("dev_deploy"){
              steps{
                echo "Dev V${1.2.3} - Deploying..."
              }
            }

  }
  post{
      always{
        echo "Dev V${1.2.3} - Run always"
      }
    }
}
