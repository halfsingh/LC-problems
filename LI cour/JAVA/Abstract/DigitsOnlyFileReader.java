package Abstract;

public class DigitsOnlyFileReader extends AbstractFileReader {

    protected DigitsOnlyFileReader(String filePath) {
        super(filePath);
    }

    @Override
    protected String parseLine(String Line) {
        return Line.replaceAll("[^0-9]", "");
    }
}
