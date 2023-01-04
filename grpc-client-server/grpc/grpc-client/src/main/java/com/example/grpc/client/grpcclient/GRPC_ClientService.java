package com.example.grpc.client.grpcclient;

import com.example.grpc.server.grpcserver.PingPongServiceGrpc;
import com.example.grpc.server.grpcserver.PingRequest;
import com.example.grpc.server.grpcserver.PongResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;

import static com.example.grpc.client.grpcclient.GrpcClientApplication.logger;

@Service
public class GRPC_ClientService {
    public String ping() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();
        logger.info(String.valueOf(channel.getState(true)));
        PingPongServiceGrpc.PingPongServiceBlockingStub stub
                = PingPongServiceGrpc.newBlockingStub(channel);
        PongResponse helloResponse = stub.ping(PingRequest.newBuilder()
                .setId(1)
                .setFirstname("Karthik Reddy")
                .setLastname("Patlolla")
                .setAge(20)
                .build());
        channel.shutdown();
        return helloResponse.getPong();
    }
}
