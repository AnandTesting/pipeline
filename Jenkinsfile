def gv
pipeline{
  agent any
  stages{
            stage("init"){
              steps{
                script{
                    gv=load "script.groovy"
                }
              }
            }

            stage("building"){
              steps{
                script{
                    gv.buildApp()
                }
              }
            }

            stage("testing"){
              steps{
                script{
                    gv.testApp()
                }
              }
            }

            stage("deploying"){
              steps{
                  script{
                      gv.deployApp()
                }
            }
    }
  }
  post{
      always{
        echo "Run always"
      }
      success{
          echo "Success"
      }
      failure{
          echo "Failure"
      }
    }
}
