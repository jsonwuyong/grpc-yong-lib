package com.linshen.grbcclient;/**
 * Created by sunny
 * 2019/2/18.
 */

import com.linshen.grpc.lib.GreeterGrpc;
import com.linshen.grpc.lib.GreeterOuterClass;
import io.grpc.Channel;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
import org.springframework.stereotype.Service;


/**
 *
 * @author
 * @create 2019-02-18 16:42
 **/
@Service
public class GrpcClientService {

     @GrpcClient("local-grpcserver")
     private Channel serviceChannel;

     public String sendMessage(String name){
         GreeterGrpc.GreeterBlockingStub stub =GreeterGrpc.newBlockingStub(serviceChannel);
         GreeterOuterClass.HelloReply response =
                  stub.sayWorld(GreeterOuterClass.HelloRequest.newBuilder().setName(name).build());
         return response.getMessage();
     }

}
