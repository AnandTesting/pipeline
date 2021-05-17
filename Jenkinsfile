pipeline{
  agent any
  stages{
            stage("dev_build"){
              steps{
                echo "Building project"
              }
            }

            stage("dev_integrate"){
              steps{
                echo "Integrating..."
              }
            }

            stage("dev_deploy"){
              steps{
                echo "Deploying..."
              }
            }

  }
  post{
      always{
        echo "dev - Run always"
      }
    }
}
