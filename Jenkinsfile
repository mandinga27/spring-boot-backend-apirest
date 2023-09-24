pipeline {
  agent any
  tools {
    gradle '7.1'
  }
  stages {
    stage('Gradle Build') {
      steps {
        bat 'gradle --version'
        //bat 'gradle build'
        //bat 'java --version'
      }
    }

    stage('Veracode Pipeline Scan') {
      steps {
        //bat 'curl -O https://downloads.veracode.com/securityscan/pipeline-scan-LATEST.zip'
        //bat 'unzip pipeline-scan-LATEST.zip pipeline-scan.jar'
        bat 'java -jar pipeline-scan.jar' \
          --veracode_api_id "077f7b5e714fd283f45775322fe97131" \
          --veracode_api_key "1e1e28b713888d239260989ddab340aff8162f5c462a42c4dbf40d109eabfeba2968e1785c76e7fab6cca9e55db0c5ca55ac2172c0b62b7626957ed78e1bcb96" \
          --file "/build/libs/spring-boot-backend-apirest-0.0.1-SNAPSHOT.jar" \
          --fail_on_severity="Very High, High" \
          --fail_on_cwe="80" \
          --project_name "${env.JOB_NAME}" \
      }
    }
    stage('Store Baseline') {
            steps {
                script {
                    try {
                        //input(message: 'Store results as baseline for future scans?', ok: 'Yes')
                        bat 'cp baseline.json build-baseline.json'
                        bat 'cp results.json baseline.json'
                    } catch (err) {

                    }
                }
            }
        }


  }
  /*
  post {
    always {
      archiveArtifacts artifacts: 'results.json', fingerprint: true
    }
  }
  */
}