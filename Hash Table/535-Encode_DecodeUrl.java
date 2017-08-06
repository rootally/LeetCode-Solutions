public class Codec {

	Map<Long,String> reversemap = new HashMap<>();

	Long val =  0L;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl)
    {    val++;
        reversemap(val,longUrl);
        return String.valueOf(val);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl)
    {	
        String.valueOf(reversemap.get(Integer.valueOf(shortUrl)));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));