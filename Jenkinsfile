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
                #input("Do you want to continue?")
                echo "Deploying..."
              }
            }

            stage("test"){
              parallel{
                          stage("unit test"){
                            steps{
                              echo "Unit Testing"
                              sleep 1
                            }
                          }

                          stage("integration test"){
                            steps{
                              echo "Integration Testing"
                              sleep 20
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
