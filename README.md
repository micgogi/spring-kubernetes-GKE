### In GKE cloud shell run this command 
For deployment  
##### kubectl create deployment hello-world-rest-api --image=micgogi/kuberimage:latest  
For expose service  
##### kubectl expose deployment hello-world-rest-api --type=LoadBalancer --port=8080

