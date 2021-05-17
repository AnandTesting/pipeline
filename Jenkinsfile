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
                              sh "sleep 20"
                            }
                          }

                          stage("integration test"){
                            steps{
                              echo "Integration Testing"
                              sh "sleep 15"
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
