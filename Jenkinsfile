node{
	stage('SCM Checkout'){
		git 'https://github.com/deyrana/Spring-Boot'
	}
	stage('Compile-Package'){
		def mvnHome = tool name: 'maven-3', type: 'maven'
		bat "${mvnHome}/bin/mvn package"
	}
}