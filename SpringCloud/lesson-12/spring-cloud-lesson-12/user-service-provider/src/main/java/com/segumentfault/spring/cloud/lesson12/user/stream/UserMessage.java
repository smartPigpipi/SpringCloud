package com.segumentfault.spring.cloud.lesson12.user.stream;

import com.segumentfault.spring.cloud.lesson12.domain.User;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * {@link User 用户} 消息 Stream 接口定义
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * @since 0.0.1
 */
public interface UserMessage {

    String INPUT = "user-message";

    @Input(INPUT)
        // 管道名称
    SubscribableChannel input();

}