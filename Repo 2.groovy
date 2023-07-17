#!groovy

def firstTest(){

    stage('build repo 2') {
        try{
            
            checkout([
                    $class: 'GitSCM',
                    //poll: true,
                    branches: [[name: 'master']],
                    userRemoteConfigs: [[url: 'https://github.com/Rajugithub1989/java-hello-world-webapp-2.git', credentialsId: 'Multiple-repos-commits-with-one-pipeline']]
                    
                ])
        }catch(err){
            echo "Stage : '${env.STAGE_NAME}' Failed : "+err.toString()
            throw err
        }
   }
    //}

    stage('Cleanup workspace'){
deleteDir()
}
}
return this
