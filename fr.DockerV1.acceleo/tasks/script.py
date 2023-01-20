from docker import DockerClient
client = DockerClient(base_url='tcp://192.168.149.128:2375')

img=client.images.pull("python")
volume=None
volume=[ '/mnt/vol2:/home/user1/'] 
network=None
client.networks.create("ntwork", driver="driver")
network="ntwork"
contain=client.containers.create('python',command='1+2',name='py3',network=network,volume=volume)


img=client.images.pull("postgres")
volume=None
volume=[ '/mnt/vol1:/var/www'] 
network=None
client.networks.create("n2", driver="test")
network="n2"
contain=client.containers.create('postgres',command='select',name='db1',network=network,volume=volume)


img=client.images.pull("ubuntu")
