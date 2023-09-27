**Input-Output Streams. File Handling**

A distinguishing feature of many programming languages is their ability to work with files and streams. In Java, the core functionality for working with streams is concentrated in classes from the java.io package.

The key concept here is the concept of a stream. Although the term "stream" in programming is quite overloaded and can denote various concepts, in this context, related to file handling and input-output operations, we will refer to a stream as an abstraction used for reading or writing information (files, sockets, console text, etc.).

A stream is associated with a real physical device through Java's input-output system. We can define a stream that is associated with a file, and through it, we can perform reading or writing of the file. It can also be a stream associated with a network socket, through which data can be sent or received over the network. All these tasks: reading and writing different types of files, exchanging information over the network, input and output to the console, are solved in Java using streams.

An object from which you can read data is called an input stream, and an object to which you can write data is called an output stream. For example, if you need to read the contents of a file, you would use an input stream, and if you need to write to a file, you would use an output stream.

At the foundation of all classes managing byte streams are two abstract classes: InputStream (representing input streams) and OutputStream (representing output streams).

However, working with bytes is not very convenient, so abstract classes Reader (for reading character streams) and Writer (for writing character streams) were added to work with character streams.

All other classes working with streams are descendants of these abstract classes.




***������ �����-������. ������ � �������***  

������������� ������ ������ ������ ���������������� �������� ������ � ������� � ��������. � Java �������� ���������� ������ � �������� ������������ � ������� �� ������ java.io.

�������� �������� ����� �������� ������� ������. ���� ������� "�����" � ���������������� �������� ����������� � ����� ���������� ��������� ��������� ���������. � ������ ������ ������������� � ������ � ������� � ������-������� �� ����� �������� � ������ (stream), ��� �� ����������, ������� ������������ ��� ������ ��� ������ ���������� (������, �������, ������ ������� � �.�.).

����� ������ � �������� ���������� ����������� � ������� ������� �����-������ Java. � ��� ����� ���� ��������� �����, ������� ������ � ������ � ����� ������� �� ����� ����� ������ ��� ������ �����. ��� ����� ����� ���� �����, ��������� � ������� �������, � ������� �������� ����� �������� ��� ��������� ������ � ����. ��� ��� ������: ������ � ������ ��������� ������, ����� ����������� �� ����, ����-������ � ������� �� ����� ������ � Java � ������� �������.

������, �� �������� ����� ������� ������, ���������� ������� �����, � ������, � ������� ����� ���������� ������, - ������� ������. ��������, ���� ���� ������� ���������� �����, �� ����������� ����� �����, � ���� ���� �������� � ���� - �� ����� ������.

� ������ ���� �������, ����������� �������� ������, ��������� ��� ����������� ������: InputStream (�������������� ������ �����) � OutputStream (�������������� ������ ������)

�� ��������� �������� � ������� �� ����� ������, �� ��� ������ � �������� �������� ���� ��������� ����������� ������ Reader (��� ������ ������� ��������) � Writer (��� ������ ������� ��������).

��� ��������� ������, ���������� � ��������, �������� ������������ ���� ����������� �������. 

