pipeline{
  agent any
  stages{
            stage("build"){
              steps{
                echo "Building project"
              }
            }

            stage("integrate"){
              steps{
                echo "Integrating..."
              }
            }

            stage("deploy"){
              steps{
                echo "Deploying..."
              }
            }

            stage("test"){
              parallel{
                          stage("unit test"){
                            steps{
                              echo "Unit Testing"
                              sleep 20
                            }
                          }

                          stage("integration test"){
                            steps{
                              echo "Integration Testing"
                              sleep 15
                            }
                          }
              }
            }
  }
  post{
      always{
        echo "Run always"
      }
    }
}
