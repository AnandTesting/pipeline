pipeline{
  agent any
  stages{
            stage("dev_build"){
              steps{
                echo "Dev - Building project"
              }
            }

            stage("dev_integrate"){
              steps{
                echo "Dev - Integrating..."
              }
            }

            stage("dev_deploy"){
              steps{
                echo "Dev - Deploying..."
              }
            }

  }
  post{
      always{
        echo "Dev - Run always"
      }
    }
}
