����   7 i  tarea3/cp/Colas  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Ltarea3/cp/Colas; main ([Ljava/lang/String;)V  java/util/LinkedList
  	  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     ! out Ljava/io/PrintStream; # *Welcome to Pizza HOT may I get your order!
 % ' & java/io/PrintStream ( ) println (Ljava/lang/String;)V + #
 write  'end'  when you finished):
  - . / nextLine ()Ljava/lang/String; 1 end
 3 5 4 java/lang/String 6 7 equalsIgnoreCase (Ljava/lang/String;)Z 9 ; : java/util/Queue < = offer (Ljava/lang/Object;)Z ? order taken. A 
Order in process: 9 C D E poll ()Ljava/lang/Object; G java/lang/StringBuilder I Delivering order: 
 F K  )
 F M N O append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 F Q R / toString 9 T U V isEmpty ()Z X 
All orders have been delivered
  Z [  close args [Ljava/lang/String; pedidos Ljava/util/Queue; scanner Ljava/util/Scanner; pedido Ljava/lang/String; LocalVariableTypeTable %Ljava/util/Queue<Ljava/lang/String;>; StackMapTable 
SourceFile 
Colas.java !               /     *� �    
                    	      L     �� Y� L� Y� � M� "� $� *� $,� ,N-0� 2� � +-� 8 W� >� $��ײ @� $� #+� B � 3N� � FYH� J-� L� P� $+� S ��ڲ W� $,� Y�    
   J    
       #  (  1  4  <  D  G  O  R  \   r  { # � % � &    4    � \ ]    � ^ _   u ` a  (  b c  \  b c  d      � ^ e  f    �  9 �  3� 
  g    h