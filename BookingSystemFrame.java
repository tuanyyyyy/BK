import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BookingSystemFrame extends JFrame {
    private JTextField customerNameField, customerPhoneField, customerEmailField, numberOfGuestsField, checkInDateField,
            checkOutDateField;
    private JComboBox<String> roomTypeBox;
    private JButton bookButton;

    public BookingSystemFrame() {
        setTitle("Hotel Booking System");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 2));

        panel.add(new JLabel("Customer Name:"));
        customerNameField = new JTextField();
        panel.add(customerNameField);

        panel.add(new JLabel("Customer Phone:"));
        customerPhoneField = new JTextField();
        panel.add(customerPhoneField);

        panel.add(new JLabel("Customer Email:"));
        customerEmailField = new JTextField();
        panel.add(customerEmailField);

        panel.add(new JLabel("Number of Guests:"));
        numberOfGuestsField = new JTextField();
        panel.add(numberOfGuestsField);

        panel.add(new JLabel("Check-in Date:"));
        checkInDateField = new JTextField();
        panel.add(checkInDateField);

        panel.add(new JLabel("Check-out Date:"));
        checkOutDateField = new JTextField();
        panel.add(checkOutDateField);

        panel.add(new JLabel("Room Type:"));
        roomTypeBox = new JComboBox<>(new String[] { "Luxury Room", "Suited Room" });
        panel.add(roomTypeBox);

        bookButton = new JButton("Book Room");
        panel.add(bookButton);

        add(panel);

        bookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get booking details
                String customerName = customerNameField.getText();
                String customerPhone = customerPhoneField.getText();
                String customerEmail = customerEmailField.getText();
                int numberOfGuests = Integer.parseInt(numberOfGuestsField.getText());
                String checkInDate = checkInDateField.getText();
                String checkOutDate = checkOutDateField.getText();
                String roomType = (String) roomTypeBox.getSelectedItem();

                // Create a Room object based on the selected room type
                @SuppressWarnings("unused")
                Room room;
                if (roomType.equals("Luxury Room")) {
                    room = new LuxuryRoom(numberOfGuests, roomType, 200, "High", true, true, true, true, true);
                } else {
                    room = new SuitedRoom(numberOfGuests, roomType, 150, true, false, true, true);
                }

                // Create a BookingSystem object
                BookingSystem bookingSystem = new BookingSystem(customerName, customerPhone, customerEmail,
                        numberOfGuests, true, checkInDate, checkOutDate, true,
                        new Location(roomType, numberOfGuests, null),
                        new Hotel("Example Hotel", "123 Street", new ArrayList<>()), new ArrayList<>());
                bookingSystem.getRooms();

                JOptionPane.showMessageDialog(null, "Room booked successfully for " + customerName, "Booking Success",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        setVisible(true);
    }
}
