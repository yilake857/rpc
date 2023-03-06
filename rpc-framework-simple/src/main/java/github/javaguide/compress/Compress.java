package github.javaguide.compress;


import github.huainan798.extension.SPI;



@SPI
public interface Compress {

    byte[] compress(byte[] bytes);


    byte[] decompress(byte[] bytes);
}
