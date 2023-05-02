import {Button, Form} from "react-bootstrap";

export const InputForm = () => {
    return (
        <Form>
            <Form.Group className="mb-3" controlId="formBasicEmail">
                <Form.Label>Request</Form.Label>
                <Form.Control type="text" placeholder="Enter request" />
            </Form.Group>
            <Button variant="primary" type="submit">
                Submit
            </Button>
        </Form>
    );
}
