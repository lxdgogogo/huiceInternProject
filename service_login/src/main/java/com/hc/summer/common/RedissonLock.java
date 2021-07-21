package com.hc.summer.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author liuyuqing
 * redisson分布式锁 AOP实现
 * ！！注意： 使用该注解的方法，如果不是定时任务，第一个参数必须为lockKey：
 * lockKey:String类型，为分布式锁的key值
 * 需要锁相同资源的锁的lockKey必须相同
 * 需要锁不同资源的锁的lockKey必须不同。因此不同业务的lockKey需要带上不同的前缀
 */
@Target({ElementType.METHOD}) //方法、方法参数注解
@Retention(RetentionPolicy.RUNTIME) //运行时可见
public @interface RedissonLock {

    /**
     * 最长等待时间，默认为10（秒）,定时任务锁始终为1秒，配置无效
     */
    int maxWaitTime() default 10;

    /**
     * 是否为定时任务调度锁，默认为false
     */
    boolean isScheduleLock() default false;
}
