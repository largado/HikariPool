pipeline {
    agent any

    stages {
        stage ('Construindo Imagem') {
            steps {
                script{
                    dockerapp = docker.build("avena/Hikari-pool", '-f ./src/Dockerfile ./src')
                }
                echo 'Imagem construída com sucesso'
            }
        }
    }
}