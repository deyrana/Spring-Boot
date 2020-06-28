pipeline{
	agent any
	
	stages{
		stage('SCM Checkout'){
			git 'https://github.com/deyrana/Spring-Boot'
		}
		stage('Compile-Package'){
			def mvnHome = tool name: 'maven-3', type: 'maven'
			sh "${mvnHome}/bin/mvn -version"
			sh "${mvnHome}/bin/mvn clean install"
		}
	}
<<<<<<< HEAD
	
	post {
		always{
			cleanWs()
		}
=======
	stage('Compile-Package'){
		def mvnHome = tool name: 'maven-3', type: 'maven'
		sh "${mvnHome}/bin/mvn clean install"
>>>>>>> ba7d71b35c1d8400bd7231bf70bdc6e09f6b9053
	}
}
