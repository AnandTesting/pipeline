pipeline{
  agent any
  
  environment{
      VERSION="1.2.5"
    }
  
  stages{ 
            stage("dev_build"){
              steps{
                echo "Dev V${VERSION} - Building project"
              }
            }

            stage("dev_integrate"){
              steps{
                echo "Dev V${VERSION} - Integrating..."
              }
            }

            stage("dev_deploy"){
              steps{
                echo "Dev V${VERSION} - Deploying..."
              }
            }

  }
  post{
      always{
        echo "Dev V${VERSION} - Run always"
      }
    }
}
